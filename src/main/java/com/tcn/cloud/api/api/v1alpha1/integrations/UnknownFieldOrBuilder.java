// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v1alpha1/integrations/service.proto

package com.tcn.cloud.api.api.v1alpha1.integrations;

public interface UnknownFieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v1alpha1.integrations.UnknownField)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the name of the field we are missing to make a complete payment link config
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * the name of the field we are missing to make a complete payment link config
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * by default matches name
   * this is the name the user wants the field displayed as
   * </pre>
   *
   * <code>string display_name = 5 [json_name = "displayName"];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * by default matches name
   * this is the name the user wants the field displayed as
   * </pre>
   *
   * <code>string display_name = 5 [json_name = "displayName"];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * the reason we need this field.
   * will point to an api call, or form that is listing the field as required
   * </pre>
   *
   * <code>string reason_needed = 2 [json_name = "reasonNeeded"];</code>
   * @return The reasonNeeded.
   */
  java.lang.String getReasonNeeded();
  /**
   * <pre>
   * the reason we need this field.
   * will point to an api call, or form that is listing the field as required
   * </pre>
   *
   * <code>string reason_needed = 2 [json_name = "reasonNeeded"];</code>
   * @return The bytes for reasonNeeded.
   */
  com.google.protobuf.ByteString
      getReasonNeededBytes();

  /**
   * <pre>
   * all the sources that are possible this field could come from
   * it is not allowed to give a provided field with a FieldSource
   * not in this list
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldSource potential_sources = 3 [json_name = "potentialSources"];</code>
   * @return A list containing the potentialSources.
   */
  java.util.List<com.tcn.cloud.api.api.commons.integrations.FieldSource> getPotentialSourcesList();
  /**
   * <pre>
   * all the sources that are possible this field could come from
   * it is not allowed to give a provided field with a FieldSource
   * not in this list
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldSource potential_sources = 3 [json_name = "potentialSources"];</code>
   * @return The count of potentialSources.
   */
  int getPotentialSourcesCount();
  /**
   * <pre>
   * all the sources that are possible this field could come from
   * it is not allowed to give a provided field with a FieldSource
   * not in this list
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldSource potential_sources = 3 [json_name = "potentialSources"];</code>
   * @param index The index of the element to return.
   * @return The potentialSources at the given index.
   */
  com.tcn.cloud.api.api.commons.integrations.FieldSource getPotentialSources(int index);
  /**
   * <pre>
   * all the sources that are possible this field could come from
   * it is not allowed to give a provided field with a FieldSource
   * not in this list
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldSource potential_sources = 3 [json_name = "potentialSources"];</code>
   * @return A list containing the enum numeric values on the wire for potentialSources.
   */
  java.util.List<java.lang.Integer>
  getPotentialSourcesValueList();
  /**
   * <pre>
   * all the sources that are possible this field could come from
   * it is not allowed to give a provided field with a FieldSource
   * not in this list
   * </pre>
   *
   * <code>repeated .api.commons.integrations.FieldSource potential_sources = 3 [json_name = "potentialSources"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of potentialSources at the given index.
   */
  int getPotentialSourcesValue(int index);

  /**
   * <pre>
   * all the fields in here will be potential fields we could use from api calls, or config look ups
   * THIS COULD BE LEFT BLANK IF THE SERVER HAS NO SUGGESTIONS
   * none of these suggestions have to be used, the user can just "write in" a ProvidedField
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ProvidedField suggested_fields = 4 [json_name = "suggestedFields"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.v1alpha1.integrations.ProvidedField> 
      getSuggestedFieldsList();
  /**
   * <pre>
   * all the fields in here will be potential fields we could use from api calls, or config look ups
   * THIS COULD BE LEFT BLANK IF THE SERVER HAS NO SUGGESTIONS
   * none of these suggestions have to be used, the user can just "write in" a ProvidedField
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ProvidedField suggested_fields = 4 [json_name = "suggestedFields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ProvidedField getSuggestedFields(int index);
  /**
   * <pre>
   * all the fields in here will be potential fields we could use from api calls, or config look ups
   * THIS COULD BE LEFT BLANK IF THE SERVER HAS NO SUGGESTIONS
   * none of these suggestions have to be used, the user can just "write in" a ProvidedField
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ProvidedField suggested_fields = 4 [json_name = "suggestedFields"];</code>
   */
  int getSuggestedFieldsCount();
  /**
   * <pre>
   * all the fields in here will be potential fields we could use from api calls, or config look ups
   * THIS COULD BE LEFT BLANK IF THE SERVER HAS NO SUGGESTIONS
   * none of these suggestions have to be used, the user can just "write in" a ProvidedField
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ProvidedField suggested_fields = 4 [json_name = "suggestedFields"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.v1alpha1.integrations.ProvidedFieldOrBuilder> 
      getSuggestedFieldsOrBuilderList();
  /**
   * <pre>
   * all the fields in here will be potential fields we could use from api calls, or config look ups
   * THIS COULD BE LEFT BLANK IF THE SERVER HAS NO SUGGESTIONS
   * none of these suggestions have to be used, the user can just "write in" a ProvidedField
   * </pre>
   *
   * <code>repeated .api.v1alpha1.integrations.ProvidedField suggested_fields = 4 [json_name = "suggestedFields"];</code>
   */
  com.tcn.cloud.api.api.v1alpha1.integrations.ProvidedFieldOrBuilder getSuggestedFieldsOrBuilder(
      int index);
}
