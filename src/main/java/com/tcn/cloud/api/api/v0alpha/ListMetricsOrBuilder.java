// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ListMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ListMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * signifies how many records existed at the beginning of the operation
   * </pre>
   *
   * <code>int32 input_record_count = 1 [json_name = "inputRecordCount"];</code>
   * @return The inputRecordCount.
   */
  int getInputRecordCount();

  /**
   * <pre>
   * how many records existed on the element at the end of the operation
   * </pre>
   *
   * <code>int32 output_record_count = 2 [json_name = "outputRecordCount"];</code>
   * @return The outputRecordCount.
   */
  int getOutputRecordCount();

  /**
   * <pre>
   * all the field names that exist in the list
   * </pre>
   *
   * <code>repeated string field_names = 3 [json_name = "fieldNames"];</code>
   * @return A list containing the fieldNames.
   */
  java.util.List<java.lang.String>
      getFieldNamesList();
  /**
   * <pre>
   * all the field names that exist in the list
   * </pre>
   *
   * <code>repeated string field_names = 3 [json_name = "fieldNames"];</code>
   * @return The count of fieldNames.
   */
  int getFieldNamesCount();
  /**
   * <pre>
   * all the field names that exist in the list
   * </pre>
   *
   * <code>repeated string field_names = 3 [json_name = "fieldNames"];</code>
   * @param index The index of the element to return.
   * @return The fieldNames at the given index.
   */
  java.lang.String getFieldNames(int index);
  /**
   * <pre>
   * all the field names that exist in the list
   * </pre>
   *
   * <code>repeated string field_names = 3 [json_name = "fieldNames"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the fieldNames at the given index.
   */
  com.google.protobuf.ByteString
      getFieldNamesBytes(int index);

  /**
   * <pre>
   * all the field types that exist. field_types[i] has a name of field_names[i].
   * THeir indexes match up
   * </pre>
   *
   * <code>repeated .api.commons.RecordType field_types = 4 [json_name = "fieldTypes", deprecated = true];</code>
   * @deprecated api.v0alpha.ListMetrics.field_types is deprecated.
   *     See api/v0alpha/lms.proto;l=2639
   * @return A list containing the fieldTypes.
   */
  @java.lang.Deprecated java.util.List<com.tcn.cloud.api.api.commons.RecordType> getFieldTypesList();
  /**
   * <pre>
   * all the field types that exist. field_types[i] has a name of field_names[i].
   * THeir indexes match up
   * </pre>
   *
   * <code>repeated .api.commons.RecordType field_types = 4 [json_name = "fieldTypes", deprecated = true];</code>
   * @deprecated api.v0alpha.ListMetrics.field_types is deprecated.
   *     See api/v0alpha/lms.proto;l=2639
   * @return The count of fieldTypes.
   */
  @java.lang.Deprecated int getFieldTypesCount();
  /**
   * <pre>
   * all the field types that exist. field_types[i] has a name of field_names[i].
   * THeir indexes match up
   * </pre>
   *
   * <code>repeated .api.commons.RecordType field_types = 4 [json_name = "fieldTypes", deprecated = true];</code>
   * @deprecated api.v0alpha.ListMetrics.field_types is deprecated.
   *     See api/v0alpha/lms.proto;l=2639
   * @param index The index of the element to return.
   * @return The fieldTypes at the given index.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.RecordType getFieldTypes(int index);
  /**
   * <pre>
   * all the field types that exist. field_types[i] has a name of field_names[i].
   * THeir indexes match up
   * </pre>
   *
   * <code>repeated .api.commons.RecordType field_types = 4 [json_name = "fieldTypes", deprecated = true];</code>
   * @deprecated api.v0alpha.ListMetrics.field_types is deprecated.
   *     See api/v0alpha/lms.proto;l=2639
   * @return A list containing the enum numeric values on the wire for fieldTypes.
   */
  @java.lang.Deprecated java.util.List<java.lang.Integer>
  getFieldTypesValueList();
  /**
   * <pre>
   * all the field types that exist. field_types[i] has a name of field_names[i].
   * THeir indexes match up
   * </pre>
   *
   * <code>repeated .api.commons.RecordType field_types = 4 [json_name = "fieldTypes", deprecated = true];</code>
   * @deprecated api.v0alpha.ListMetrics.field_types is deprecated.
   *     See api/v0alpha/lms.proto;l=2639
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of fieldTypes at the given index.
   */
  @java.lang.Deprecated int getFieldTypesValue(int index);

  /**
   * <code>repeated .api.commons.FieldType ftypes = 18 [json_name = "ftypes"];</code>
   * @return A list containing the ftypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.FieldType> getFtypesList();
  /**
   * <code>repeated .api.commons.FieldType ftypes = 18 [json_name = "ftypes"];</code>
   * @return The count of ftypes.
   */
  int getFtypesCount();
  /**
   * <code>repeated .api.commons.FieldType ftypes = 18 [json_name = "ftypes"];</code>
   * @param index The index of the element to return.
   * @return The ftypes at the given index.
   */
  com.tcn.cloud.api.api.commons.FieldType getFtypes(int index);
  /**
   * <code>repeated .api.commons.FieldType ftypes = 18 [json_name = "ftypes"];</code>
   * @return A list containing the enum numeric values on the wire for ftypes.
   */
  java.util.List<java.lang.Integer>
  getFtypesValueList();
  /**
   * <code>repeated .api.commons.FieldType ftypes = 18 [json_name = "ftypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of ftypes at the given index.
   */
  int getFtypesValue(int index);

  /**
   * <pre>
   * the counts of the field_name[i], field_type[i] pairs.
   * ex: if field_name[i] == 'test' and field_types[i] == record_type_err, and field_counts[i] == 10
   * means we woud have 10 fiels named test that were error types in the list.
   * </pre>
   *
   * <code>repeated int32 field_counts = 5 [json_name = "fieldCounts"];</code>
   * @return A list containing the fieldCounts.
   */
  java.util.List<java.lang.Integer> getFieldCountsList();
  /**
   * <pre>
   * the counts of the field_name[i], field_type[i] pairs.
   * ex: if field_name[i] == 'test' and field_types[i] == record_type_err, and field_counts[i] == 10
   * means we woud have 10 fiels named test that were error types in the list.
   * </pre>
   *
   * <code>repeated int32 field_counts = 5 [json_name = "fieldCounts"];</code>
   * @return The count of fieldCounts.
   */
  int getFieldCountsCount();
  /**
   * <pre>
   * the counts of the field_name[i], field_type[i] pairs.
   * ex: if field_name[i] == 'test' and field_types[i] == record_type_err, and field_counts[i] == 10
   * means we woud have 10 fiels named test that were error types in the list.
   * </pre>
   *
   * <code>repeated int32 field_counts = 5 [json_name = "fieldCounts"];</code>
   * @param index The index of the element to return.
   * @return The fieldCounts at the given index.
   */
  int getFieldCounts(int index);

  /**
   * <pre>
   * the run type for the exchange.  Will only mean anything if the element is an exchange.
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 6 [json_name = "runType"];</code>
   * @return The enum numeric value on the wire for runType.
   */
  int getRunTypeValue();
  /**
   * <pre>
   * the run type for the exchange.  Will only mean anything if the element is an exchange.
   * </pre>
   *
   * <code>.api.commons.RunType run_type = 6 [json_name = "runType"];</code>
   * @return The runType.
   */
  com.tcn.cloud.api.api.commons.RunType getRunType();

  /**
   * <pre>
   * will contain the http post response body from the POST request to p3 backoffice
   * only relevent on p3 exchange elements.
   * </pre>
   *
   * <code>string success_message = 7 [json_name = "successMessage"];</code>
   * @return The successMessage.
   */
  java.lang.String getSuccessMessage();
  /**
   * <pre>
   * will contain the http post response body from the POST request to p3 backoffice
   * only relevent on p3 exchange elements.
   * </pre>
   *
   * <code>string success_message = 7 [json_name = "successMessage"];</code>
   * @return The bytes for successMessage.
   */
  com.google.protobuf.ByteString
      getSuccessMessageBytes();

  /**
   * <pre>
   * specifies the number of fields the largest record had in the list.
   * ex: max_record_width of 10 means that there exists at least 1 record in the list had 10 fields.
   * meta fields (fields that start with an '_') are not counted
   * </pre>
   *
   * <code>int32 max_record_width = 8 [json_name = "maxRecordWidth"];</code>
   * @return The maxRecordWidth.
   */
  int getMaxRecordWidth();

  /**
   * <pre>
   * opposite of max_record_width
   * </pre>
   *
   * <code>int32 min_record_width = 9 [json_name = "minRecordWidth"];</code>
   * @return The minRecordWidth.
   */
  int getMinRecordWidth();

  /**
   * <pre>
   * the first index we can find the record with max_record_width fields
   * </pre>
   *
   * <code>int32 max_record_index = 10 [json_name = "maxRecordIndex"];</code>
   * @return The maxRecordIndex.
   */
  int getMaxRecordIndex();

  /**
   * <pre>
   * the first index we can find the record with min_record_width fields
   * </pre>
   *
   * <code>int32 min_record_index = 11 [json_name = "minRecordIndex"];</code>
   * @return The minRecordIndex.
   */
  int getMinRecordIndex();

  /**
   * <pre>
   * the upstream files that were used to process this element.
   * usually this field will either be empty, or have 1 item in it.
   * </pre>
   *
   * <code>repeated string files = 12 [json_name = "files"];</code>
   * @return A list containing the files.
   */
  java.util.List<java.lang.String>
      getFilesList();
  /**
   * <pre>
   * the upstream files that were used to process this element.
   * usually this field will either be empty, or have 1 item in it.
   * </pre>
   *
   * <code>repeated string files = 12 [json_name = "files"];</code>
   * @return The count of files.
   */
  int getFilesCount();
  /**
   * <pre>
   * the upstream files that were used to process this element.
   * usually this field will either be empty, or have 1 item in it.
   * </pre>
   *
   * <code>repeated string files = 12 [json_name = "files"];</code>
   * @param index The index of the element to return.
   * @return The files at the given index.
   */
  java.lang.String getFiles(int index);
  /**
   * <pre>
   * the upstream files that were used to process this element.
   * usually this field will either be empty, or have 1 item in it.
   * </pre>
   *
   * <code>repeated string files = 12 [json_name = "files"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the files at the given index.
   */
  com.google.protobuf.ByteString
      getFilesBytes(int index);

  /**
   * <pre>
   * which groups exist in the list.
   * a group is a tagged record with a field '_group' and a string payload
   * </pre>
   *
   * <code>repeated string groups = 13 [json_name = "groups"];</code>
   * @return A list containing the groups.
   */
  java.util.List<java.lang.String>
      getGroupsList();
  /**
   * <pre>
   * which groups exist in the list.
   * a group is a tagged record with a field '_group' and a string payload
   * </pre>
   *
   * <code>repeated string groups = 13 [json_name = "groups"];</code>
   * @return The count of groups.
   */
  int getGroupsCount();
  /**
   * <pre>
   * which groups exist in the list.
   * a group is a tagged record with a field '_group' and a string payload
   * </pre>
   *
   * <code>repeated string groups = 13 [json_name = "groups"];</code>
   * @param index The index of the element to return.
   * @return The groups at the given index.
   */
  java.lang.String getGroups(int index);
  /**
   * <pre>
   * which groups exist in the list.
   * a group is a tagged record with a field '_group' and a string payload
   * </pre>
   *
   * <code>repeated string groups = 13 [json_name = "groups"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the groups at the given index.
   */
  com.google.protobuf.ByteString
      getGroupsBytes(int index);

  /**
   * <pre>
   * represents which fields were looked up, but were missing from the record
   * this is the set of all missing fields
   * </pre>
   *
   * <code>repeated string missing_fields = 15 [json_name = "missingFields"];</code>
   * @return A list containing the missingFields.
   */
  java.util.List<java.lang.String>
      getMissingFieldsList();
  /**
   * <pre>
   * represents which fields were looked up, but were missing from the record
   * this is the set of all missing fields
   * </pre>
   *
   * <code>repeated string missing_fields = 15 [json_name = "missingFields"];</code>
   * @return The count of missingFields.
   */
  int getMissingFieldsCount();
  /**
   * <pre>
   * represents which fields were looked up, but were missing from the record
   * this is the set of all missing fields
   * </pre>
   *
   * <code>repeated string missing_fields = 15 [json_name = "missingFields"];</code>
   * @param index The index of the element to return.
   * @return The missingFields at the given index.
   */
  java.lang.String getMissingFields(int index);
  /**
   * <pre>
   * represents which fields were looked up, but were missing from the record
   * this is the set of all missing fields
   * </pre>
   *
   * <code>repeated string missing_fields = 15 [json_name = "missingFields"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the missingFields at the given index.
   */
  com.google.protobuf.ByteString
      getMissingFieldsBytes(int index);

  /**
   * <pre>
   * represents how many seconds it took for the event to start getting worked on
   * </pre>
   *
   * <code>double seconds_to_start = 16 [json_name = "secondsToStart"];</code>
   * @return The secondsToStart.
   */
  double getSecondsToStart();

  /**
   * <pre>
   * represents how mahy seconds it took to process the event
   * </pre>
   *
   * <code>double seconds_to_process = 17 [json_name = "secondsToProcess"];</code>
   * @return The secondsToProcess.
   */
  double getSecondsToProcess();
}
