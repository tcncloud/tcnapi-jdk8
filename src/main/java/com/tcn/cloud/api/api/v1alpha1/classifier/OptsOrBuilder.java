// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/classifier/entities.proto

package com.tcn.cloud.api.api.v1alpha1.classifier;

public interface OptsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.classifier.Opts)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * map from field name to date format
   * e.g: "dob": yyyy/mm/dd
   * </pre>
   *
   * <code>map&lt;string, string&gt; date_formats = 1 [json_name = "dateFormats"];</code>
   */
  int getDateFormatsCount();
  /**
   * <pre>
   * map from field name to date format
   * e.g: "dob": yyyy/mm/dd
   * </pre>
   *
   * <code>map&lt;string, string&gt; date_formats = 1 [json_name = "dateFormats"];</code>
   */
  boolean containsDateFormats(
      java.lang.String key);
  /**
   * Use {@link #getDateFormatsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDateFormats();
  /**
   * <pre>
   * map from field name to date format
   * e.g: "dob": yyyy/mm/dd
   * </pre>
   *
   * <code>map&lt;string, string&gt; date_formats = 1 [json_name = "dateFormats"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDateFormatsMap();
  /**
   * <pre>
   * map from field name to date format
   * e.g: "dob": yyyy/mm/dd
   * </pre>
   *
   * <code>map&lt;string, string&gt; date_formats = 1 [json_name = "dateFormats"];</code>
   */
  /* nullable */
java.lang.String getDateFormatsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * map from field name to date format
   * e.g: "dob": yyyy/mm/dd
   * </pre>
   *
   * <code>map&lt;string, string&gt; date_formats = 1 [json_name = "dateFormats"];</code>
   */
  java.lang.String getDateFormatsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * keys are old field names, values are new field names
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_fields = 2 [json_name = "renameFields"];</code>
   */
  int getRenameFieldsCount();
  /**
   * <pre>
   * keys are old field names, values are new field names
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_fields = 2 [json_name = "renameFields"];</code>
   */
  boolean containsRenameFields(
      java.lang.String key);
  /**
   * Use {@link #getRenameFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRenameFields();
  /**
   * <pre>
   * keys are old field names, values are new field names
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_fields = 2 [json_name = "renameFields"];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRenameFieldsMap();
  /**
   * <pre>
   * keys are old field names, values are new field names
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_fields = 2 [json_name = "renameFields"];</code>
   */
  /* nullable */
java.lang.String getRenameFieldsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * keys are old field names, values are new field names
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_fields = 2 [json_name = "renameFields"];</code>
   */
  java.lang.String getRenameFieldsOrThrow(
      java.lang.String key);

  /**
   * <code>.api.v1alpha1.classifier.ParseOpts parse_opts = 3 [json_name = "parseOpts"];</code>
   * @return Whether the parseOpts field is set.
   */
  boolean hasParseOpts();
  /**
   * <code>.api.v1alpha1.classifier.ParseOpts parse_opts = 3 [json_name = "parseOpts"];</code>
   * @return The parseOpts.
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.ParseOpts getParseOpts();
  /**
   * <code>.api.v1alpha1.classifier.ParseOpts parse_opts = 3 [json_name = "parseOpts"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.ParseOptsOrBuilder getParseOptsOrBuilder();

  /**
   * <code>.api.v1alpha1.classifier.Constraints constraints = 4 [json_name = "constraints"];</code>
   * @return Whether the constraints field is set.
   */
  boolean hasConstraints();
  /**
   * <code>.api.v1alpha1.classifier.Constraints constraints = 4 [json_name = "constraints"];</code>
   * @return The constraints.
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.Constraints getConstraints();
  /**
   * <code>.api.v1alpha1.classifier.Constraints constraints = 4 [json_name = "constraints"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.classifier.ConstraintsOrBuilder getConstraintsOrBuilder();
}