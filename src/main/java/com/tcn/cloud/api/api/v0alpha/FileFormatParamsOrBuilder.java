// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface FileFormatParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.FileFormatParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * use skip_first_lines
   * </pre>
   *
   * <code>int32 skip_first_no_lines = 10 [json_name = "skipFirstNoLines", deprecated = true];</code>
   * @deprecated api.v0alpha.FileFormatParams.skip_first_no_lines is deprecated.
   *     See api/v0alpha/lms.proto;l=1966
   * @return The skipFirstNoLines.
   */
  @java.lang.Deprecated int getSkipFirstNoLines();

  /**
   * <code>string skip_lines_match_regex = 11 [json_name = "skipLinesMatchRegex", deprecated = true];</code>
   * @deprecated api.v0alpha.FileFormatParams.skip_lines_match_regex is deprecated.
   *     See api/v0alpha/lms.proto;l=1967
   * @return The skipLinesMatchRegex.
   */
  @java.lang.Deprecated java.lang.String getSkipLinesMatchRegex();
  /**
   * <code>string skip_lines_match_regex = 11 [json_name = "skipLinesMatchRegex", deprecated = true];</code>
   * @deprecated api.v0alpha.FileFormatParams.skip_lines_match_regex is deprecated.
   *     See api/v0alpha/lms.proto;l=1967
   * @return The bytes for skipLinesMatchRegex.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getSkipLinesMatchRegexBytes();

  /**
   * <code>bool trim_spaces = 12 [json_name = "trimSpaces"];</code>
   * @return The trimSpaces.
   */
  boolean getTrimSpaces();

  /**
   * <code>string custom_delimiter = 13 [json_name = "customDelimiter"];</code>
   * @return The customDelimiter.
   */
  java.lang.String getCustomDelimiter();
  /**
   * <code>string custom_delimiter = 13 [json_name = "customDelimiter"];</code>
   * @return The bytes for customDelimiter.
   */
  com.google.protobuf.ByteString
      getCustomDelimiterBytes();

  /**
   * <code>bool skip_first_line = 14 [json_name = "skipFirstLine"];</code>
   * @return The skipFirstLine.
   */
  boolean getSkipFirstLine();

  /**
   * <pre>
   * for json file formats:
   * if non-empty represents that the file is one large json object,
   * and that this is the json path to the root that contains all the records.
   * example: { response: { records: [...] } }
   * to get to the records stored at [...], we would use
   * json_dot_path="response.records"
   * If left blank, we are expected each json object to be on its own line: (jsonl)
   * </pre>
   *
   * <code>string json_dot_path = 15 [json_name = "jsonDotPath"];</code>
   * @return The jsonDotPath.
   */
  java.lang.String getJsonDotPath();
  /**
   * <pre>
   * for json file formats:
   * if non-empty represents that the file is one large json object,
   * and that this is the json path to the root that contains all the records.
   * example: { response: { records: [...] } }
   * to get to the records stored at [...], we would use
   * json_dot_path="response.records"
   * If left blank, we are expected each json object to be on its own line: (jsonl)
   * </pre>
   *
   * <code>string json_dot_path = 15 [json_name = "jsonDotPath"];</code>
   * @return The bytes for jsonDotPath.
   */
  com.google.protobuf.ByteString
      getJsonDotPathBytes();
}
