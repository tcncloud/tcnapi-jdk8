// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface SftpExportProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.SftpExportProcess)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * where we try and write the data to on the destination filesystem
   * </pre>
   *
   * <code>string dest_filepath = 1 [json_name = "destFilepath"];</code>
   * @return The destFilepath.
   */
  java.lang.String getDestFilepath();
  /**
   * <pre>
   * where we try and write the data to on the destination filesystem
   * </pre>
   *
   * <code>string dest_filepath = 1 [json_name = "destFilepath"];</code>
   * @return The bytes for destFilepath.
   */
  com.google.protobuf.ByteString
      getDestFilepathBytes();

  /**
   * <pre>
   * if left "", the service will attempt to use a public key instead
   * </pre>
   *
   * <code>string password = 2 [json_name = "password"];</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * if left "", the service will attempt to use a public key instead
   * </pre>
   *
   * <code>string password = 2 [json_name = "password"];</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <pre>
   * where we are trying to connect to.
   * </pre>
   *
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * where we are trying to connect to.
   * </pre>
   *
   * <code>string address = 3 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * username for sftp connection
   * </pre>
   *
   * <code>string username = 4 [json_name = "username"];</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <pre>
   * username for sftp connection
   * </pre>
   *
   * <code>string username = 4 [json_name = "username"];</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <pre>
   * port we will attempt to establish a connection with
   * </pre>
   *
   * <code>int32 port = 5 [json_name = "port"];</code>
   * @return The port.
   */
  int getPort();

  /**
   * <pre>
   * File format to use (CSV, CUSTOM, TSV, etc.)
   * `field_delimiter`, `record_dilimiter`, and `quote_fields`
   * will be ignored the the format is not CUSTOM
   * </pre>
   *
   * <code>.api.commons.FileFormat fileformat = 7 [json_name = "fileformat"];</code>
   * @return The enum numeric value on the wire for fileformat.
   */
  int getFileformatValue();
  /**
   * <pre>
   * File format to use (CSV, CUSTOM, TSV, etc.)
   * `field_delimiter`, `record_dilimiter`, and `quote_fields`
   * will be ignored the the format is not CUSTOM
   * </pre>
   *
   * <code>.api.commons.FileFormat fileformat = 7 [json_name = "fileformat"];</code>
   * @return The fileformat.
   */
  com.tcn.cloud.api.api.commons.FileFormat getFileformat();

  /**
   * <pre>
   * Specifies whether to use headers in the
   * export file or not.
   * </pre>
   *
   * <code>bool prepend_headers = 8 [json_name = "prependHeaders"];</code>
   * @return The prependHeaders.
   */
  boolean getPrependHeaders();

  /**
   * <pre>
   * Specifies custom field delimiter (default `,`)
   * </pre>
   *
   * <code>string field_delimiter = 9 [json_name = "fieldDelimiter"];</code>
   * @return The fieldDelimiter.
   */
  java.lang.String getFieldDelimiter();
  /**
   * <pre>
   * Specifies custom field delimiter (default `,`)
   * </pre>
   *
   * <code>string field_delimiter = 9 [json_name = "fieldDelimiter"];</code>
   * @return The bytes for fieldDelimiter.
   */
  com.google.protobuf.ByteString
      getFieldDelimiterBytes();

  /**
   * <pre>
   * Specifies custom record delimiter (default `&#92;n`)
   * </pre>
   *
   * <code>string record_delimiter = 10 [json_name = "recordDelimiter"];</code>
   * @return The recordDelimiter.
   */
  java.lang.String getRecordDelimiter();
  /**
   * <pre>
   * Specifies custom record delimiter (default `&#92;n`)
   * </pre>
   *
   * <code>string record_delimiter = 10 [json_name = "recordDelimiter"];</code>
   * @return The bytes for recordDelimiter.
   */
  com.google.protobuf.ByteString
      getRecordDelimiterBytes();

  /**
   * <pre>
   * Specifies the construction of the export filename
   * </pre>
   *
   * <code>.api.commons.FilePattern file_pattern = 11 [json_name = "filePattern", deprecated = true];</code>
   * @deprecated api.v0alpha.SftpExportProcess.file_pattern is deprecated.
   *     See api/v0alpha/lms.proto;l=2070
   * @return Whether the filePattern field is set.
   */
  @java.lang.Deprecated boolean hasFilePattern();
  /**
   * <pre>
   * Specifies the construction of the export filename
   * </pre>
   *
   * <code>.api.commons.FilePattern file_pattern = 11 [json_name = "filePattern", deprecated = true];</code>
   * @deprecated api.v0alpha.SftpExportProcess.file_pattern is deprecated.
   *     See api/v0alpha/lms.proto;l=2070
   * @return The filePattern.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.FilePattern getFilePattern();
  /**
   * <pre>
   * Specifies the construction of the export filename
   * </pre>
   *
   * <code>.api.commons.FilePattern file_pattern = 11 [json_name = "filePattern", deprecated = true];</code>
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.FilePatternOrBuilder getFilePatternOrBuilder();

  /**
   * <pre>
   * Run type can be RUN (default), TEST, or DISABLED
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 12 [json_name = "runType"];</code>
   * @return The enum numeric value on the wire for runType.
   */
  int getRunTypeValue();
  /**
   * <pre>
   * Run type can be RUN (default), TEST, or DISABLED
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 12 [json_name = "runType"];</code>
   * @return The runType.
   */
  com.tcn.cloud.api.api.commons.RunType getRunType();

  /**
   * <pre>
   * Specifies which fields to export
   * </pre>
   *
   * <code>.api.v0alpha.ExportHeader header = 13 [json_name = "header"];</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Specifies which fields to export
   * </pre>
   *
   * <code>.api.v0alpha.ExportHeader header = 13 [json_name = "header"];</code>
   * @return The header.
   */
  com.tcn.cloud.api.api.v0alpha.ExportHeader getHeader();
  /**
   * <pre>
   * Specifies which fields to export
   * </pre>
   *
   * <code>.api.v0alpha.ExportHeader header = 13 [json_name = "header"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ExportHeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Wrap fields with `"`
   * </pre>
   *
   * <code>bool quote_fields = 14 [json_name = "quoteFields"];</code>
   * @return The quoteFields.
   */
  boolean getQuoteFields();

  /**
   * <pre>
   * Specifies whether to export using the date
   * format defined by the field in the file
   * template or use the default
   * </pre>
   *
   * <code>bool use_custom_date_format = 15 [json_name = "useCustomDateFormat"];</code>
   * @return The useCustomDateFormat.
   */
  boolean getUseCustomDateFormat();

  /**
   * <pre>
   * directory to put the file in
   * </pre>
   *
   * <code>string directory = 16 [json_name = "directory"];</code>
   * @return The directory.
   */
  java.lang.String getDirectory();
  /**
   * <pre>
   * directory to put the file in
   * </pre>
   *
   * <code>string directory = 16 [json_name = "directory"];</code>
   * @return The bytes for directory.
   */
  com.google.protobuf.ByteString
      getDirectoryBytes();

  /**
   * <pre>
   * what to name the file
   * </pre>
   *
   * <code>.api.commons.ConstructedFilename filename = 17 [json_name = "filename"];</code>
   * @return Whether the filename field is set.
   */
  boolean hasFilename();
  /**
   * <pre>
   * what to name the file
   * </pre>
   *
   * <code>.api.commons.ConstructedFilename filename = 17 [json_name = "filename"];</code>
   * @return The filename.
   */
  com.tcn.cloud.api.api.commons.ConstructedFilename getFilename();
  /**
   * <pre>
   * what to name the file
   * </pre>
   *
   * <code>.api.commons.ConstructedFilename filename = 17 [json_name = "filename"];</code>
   */
  com.tcn.cloud.api.api.commons.ConstructedFilenameOrBuilder getFilenameOrBuilder();

  /**
   * <pre>
   * If true, it will try to bunch all phone number
   * fields to the left.
   * </pre>
   *
   * <code>bool shift_phone_fields = 18 [json_name = "shiftPhoneFields"];</code>
   * @return The shiftPhoneFields.
   */
  boolean getShiftPhoneFields();

  /**
   * <pre>
   * transfer configs will be unique by name, transfer configs store credential data
   * </pre>
   *
   * <code>string transfer_config_name = 19 [json_name = "transferConfigName"];</code>
   * @return The transferConfigName.
   */
  java.lang.String getTransferConfigName();
  /**
   * <pre>
   * transfer configs will be unique by name, transfer configs store credential data
   * </pre>
   *
   * <code>string transfer_config_name = 19 [json_name = "transferConfigName"];</code>
   * @return The bytes for transferConfigName.
   */
  com.google.protobuf.ByteString
      getTransferConfigNameBytes();
}
