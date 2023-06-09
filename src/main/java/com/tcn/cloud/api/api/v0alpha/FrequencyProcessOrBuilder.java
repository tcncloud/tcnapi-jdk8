// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface FrequencyProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.FrequencyProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * LMS field from the list to be used
   * </pre>
   *
   * <code>string field = 4 [json_name = "field"];</code>
   * @return The field.
   */
  java.lang.String getField();
  /**
   * <pre>
   * LMS field from the list to be used
   * </pre>
   *
   * <code>string field = 4 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <pre>
   * Duration to check frequency
   * </pre>
   *
   * <code>int64 days = 5 [json_name = "days"];</code>
   * @return The days.
   */
  long getDays();

  /**
   * <pre>
   * Country code needed if `field` is a phone number
   * </pre>
   *
   * <code>string country_code = 6 [json_name = "countryCode"];</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Country code needed if `field` is a phone number
   * </pre>
   *
   * <code>string country_code = 6 [json_name = "countryCode"];</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * Field we are checking against in frequency
   * e.g. Account Number
   * Will default to "phone_number"
   * </pre>
   *
   * <code>string meta_field = 7 [json_name = "metaField"];</code>
   * @return The metaField.
   */
  java.lang.String getMetaField();
  /**
   * <pre>
   * Field we are checking against in frequency
   * e.g. Account Number
   * Will default to "phone_number"
   * </pre>
   *
   * <code>string meta_field = 7 [json_name = "metaField"];</code>
   * @return The bytes for metaField.
   */
  com.google.protobuf.ByteString
      getMetaFieldBytes();

  /**
   * <pre>
   * Option for dispositions given in key
   * value pairs. Value is optional, it will
   * just check for existence of key if left out.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 8 [json_name = "dispositions"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionPair> 
      getDispositionsList();
  /**
   * <pre>
   * Option for dispositions given in key
   * value pairs. Value is optional, it will
   * just check for existence of key if left out.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 8 [json_name = "dispositions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DispositionPair getDispositions(int index);
  /**
   * <pre>
   * Option for dispositions given in key
   * value pairs. Value is optional, it will
   * just check for existence of key if left out.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 8 [json_name = "dispositions"];</code>
   */
  int getDispositionsCount();
  /**
   * <pre>
   * Option for dispositions given in key
   * value pairs. Value is optional, it will
   * just check for existence of key if left out.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 8 [json_name = "dispositions"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder> 
      getDispositionsOrBuilderList();
  /**
   * <pre>
   * Option for dispositions given in key
   * value pairs. Value is optional, it will
   * just check for existence of key if left out.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionPair dispositions = 8 [json_name = "dispositions"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DispositionPairOrBuilder getDispositionsOrBuilder(
      int index);

  /**
   * <pre>
   * Different result types
   * e.g. Answered,Answered Machine,Busy, etc.
   * </pre>
   *
   * <code>repeated string results = 9 [json_name = "results"];</code>
   * @return A list containing the results.
   */
  java.util.List<java.lang.String>
      getResultsList();
  /**
   * <pre>
   * Different result types
   * e.g. Answered,Answered Machine,Busy, etc.
   * </pre>
   *
   * <code>repeated string results = 9 [json_name = "results"];</code>
   * @return The count of results.
   */
  int getResultsCount();
  /**
   * <pre>
   * Different result types
   * e.g. Answered,Answered Machine,Busy, etc.
   * </pre>
   *
   * <code>repeated string results = 9 [json_name = "results"];</code>
   * @param index The index of the element to return.
   * @return The results at the given index.
   */
  java.lang.String getResults(int index);
  /**
   * <pre>
   * Different result types
   * e.g. Answered,Answered Machine,Busy, etc.
   * </pre>
   *
   * <code>repeated string results = 9 [json_name = "results"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the results at the given index.
   */
  com.google.protobuf.ByteString
      getResultsBytes(int index);

  /**
   * <pre>
   * Options for dispositions given in key/value
   * pair sets. Values are optional. Must have
   * at least one match in each set.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionSet disposition_sets = 10 [json_name = "dispositionSets"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v0alpha.DispositionSet> 
      getDispositionSetsList();
  /**
   * <pre>
   * Options for dispositions given in key/value
   * pair sets. Values are optional. Must have
   * at least one match in each set.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionSet disposition_sets = 10 [json_name = "dispositionSets"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DispositionSet getDispositionSets(int index);
  /**
   * <pre>
   * Options for dispositions given in key/value
   * pair sets. Values are optional. Must have
   * at least one match in each set.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionSet disposition_sets = 10 [json_name = "dispositionSets"];</code>
   */
  int getDispositionSetsCount();
  /**
   * <pre>
   * Options for dispositions given in key/value
   * pair sets. Values are optional. Must have
   * at least one match in each set.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionSet disposition_sets = 10 [json_name = "dispositionSets"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v0alpha.DispositionSetOrBuilder> 
      getDispositionSetsOrBuilderList();
  /**
   * <pre>
   * Options for dispositions given in key/value
   * pair sets. Values are optional. Must have
   * at least one match in each set.
   * </pre>
   *
   * <code>repeated .api.v0alpha.DispositionSet disposition_sets = 10 [json_name = "dispositionSets"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.DispositionSetOrBuilder getDispositionSetsOrBuilder(
      int index);
}
