// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/v0alpha/lms.proto

package com.tcn.cloud.api.api.v0alpha;

public interface ReshapeActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.v0alpha.ReshapeAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * NOT a FieldIndex
   * </pre>
   *
   * <code>string field = 19 [json_name = "field"];</code>
   * @return The field.
   */
  java.lang.String getField();
  /**
   * <pre>
   * NOT a FieldIndex
   * </pre>
   *
   * <code>string field = 19 [json_name = "field"];</code>
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <pre>
   * will only execute on the matching type (defaults to ALL)
   * </pre>
   *
   * <code>.api.commons.RecordType matching_type = 20 [json_name = "matchingType", deprecated = true];</code>
   * @deprecated api.v0alpha.ReshapeAction.matching_type is deprecated.
   *     See api/v0alpha/lms.proto;l=2273
   * @return The enum numeric value on the wire for matchingType.
   */
  @java.lang.Deprecated int getMatchingTypeValue();
  /**
   * <pre>
   * will only execute on the matching type (defaults to ALL)
   * </pre>
   *
   * <code>.api.commons.RecordType matching_type = 20 [json_name = "matchingType", deprecated = true];</code>
   * @deprecated api.v0alpha.ReshapeAction.matching_type is deprecated.
   *     See api/v0alpha/lms.proto;l=2273
   * @return The matchingType.
   */
  @java.lang.Deprecated com.tcn.cloud.api.api.commons.RecordType getMatchingType();

  /**
   * <code>.api.v0alpha.FilterCheck predicate = 50 [json_name = "predicate"];</code>
   * @return Whether the predicate field is set.
   */
  boolean hasPredicate();
  /**
   * <code>.api.v0alpha.FilterCheck predicate = 50 [json_name = "predicate"];</code>
   * @return The predicate.
   */
  com.tcn.cloud.api.api.v0alpha.FilterCheck getPredicate();
  /**
   * <code>.api.v0alpha.FilterCheck predicate = 50 [json_name = "predicate"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.FilterCheckOrBuilder getPredicateOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Rename rename = 22 [json_name = "rename"];</code>
   * @return Whether the rename field is set.
   */
  boolean hasRename();
  /**
   * <code>.api.v0alpha.ReshapeAction.Rename rename = 22 [json_name = "rename"];</code>
   * @return The rename.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Rename getRename();
  /**
   * <code>.api.v0alpha.ReshapeAction.Rename rename = 22 [json_name = "rename"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.RenameOrBuilder getRenameOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.AddValue add_value = 23 [json_name = "addValue"];</code>
   * @return Whether the addValue field is set.
   */
  boolean hasAddValue();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddValue add_value = 23 [json_name = "addValue"];</code>
   * @return The addValue.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddValue getAddValue();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddValue add_value = 23 [json_name = "addValue"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddValueOrBuilder getAddValueOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.AddField add_field = 24 [json_name = "addField"];</code>
   * @return Whether the addField field is set.
   */
  boolean hasAddField();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddField add_field = 24 [json_name = "addField"];</code>
   * @return The addField.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddField getAddField();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddField add_field = 24 [json_name = "addField"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddFieldOrBuilder getAddFieldOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.AddDate add_date = 47 [json_name = "addDate"];</code>
   * @return Whether the addDate field is set.
   */
  boolean hasAddDate();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddDate add_date = 47 [json_name = "addDate"];</code>
   * @return The addDate.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddDate getAddDate();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddDate add_date = 47 [json_name = "addDate"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddDateOrBuilder getAddDateOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.SubtractValue subtract_value = 25 [json_name = "subtractValue"];</code>
   * @return Whether the subtractValue field is set.
   */
  boolean hasSubtractValue();
  /**
   * <code>.api.v0alpha.ReshapeAction.SubtractValue subtract_value = 25 [json_name = "subtractValue"];</code>
   * @return The subtractValue.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SubtractValue getSubtractValue();
  /**
   * <code>.api.v0alpha.ReshapeAction.SubtractValue subtract_value = 25 [json_name = "subtractValue"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SubtractValueOrBuilder getSubtractValueOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.SubtractField subtract_field = 26 [json_name = "subtractField"];</code>
   * @return Whether the subtractField field is set.
   */
  boolean hasSubtractField();
  /**
   * <code>.api.v0alpha.ReshapeAction.SubtractField subtract_field = 26 [json_name = "subtractField"];</code>
   * @return The subtractField.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SubtractField getSubtractField();
  /**
   * <code>.api.v0alpha.ReshapeAction.SubtractField subtract_field = 26 [json_name = "subtractField"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SubtractFieldOrBuilder getSubtractFieldOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Convert convert = 28 [json_name = "convert"];</code>
   * @return Whether the convert field is set.
   */
  boolean hasConvert();
  /**
   * <code>.api.v0alpha.ReshapeAction.Convert convert = 28 [json_name = "convert"];</code>
   * @return The convert.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Convert getConvert();
  /**
   * <code>.api.v0alpha.ReshapeAction.Convert convert = 28 [json_name = "convert"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.ConvertOrBuilder getConvertOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.RemoveField remove_field = 29 [json_name = "removeField"];</code>
   * @return Whether the removeField field is set.
   */
  boolean hasRemoveField();
  /**
   * <code>.api.v0alpha.ReshapeAction.RemoveField remove_field = 29 [json_name = "removeField"];</code>
   * @return The removeField.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.RemoveField getRemoveField();
  /**
   * <code>.api.v0alpha.ReshapeAction.RemoveField remove_field = 29 [json_name = "removeField"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.RemoveFieldOrBuilder getRemoveFieldOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.AddNewField add_new_field = 30 [json_name = "addNewField"];</code>
   * @return Whether the addNewField field is set.
   */
  boolean hasAddNewField();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddNewField add_new_field = 30 [json_name = "addNewField"];</code>
   * @return The addNewField.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddNewField getAddNewField();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddNewField add_new_field = 30 [json_name = "addNewField"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddNewFieldOrBuilder getAddNewFieldOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.ChangeCurrencyType change_currency_type = 31 [json_name = "changeCurrencyType"];</code>
   * @return Whether the changeCurrencyType field is set.
   */
  boolean hasChangeCurrencyType();
  /**
   * <code>.api.v0alpha.ReshapeAction.ChangeCurrencyType change_currency_type = 31 [json_name = "changeCurrencyType"];</code>
   * @return The changeCurrencyType.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.ChangeCurrencyType getChangeCurrencyType();
  /**
   * <code>.api.v0alpha.ReshapeAction.ChangeCurrencyType change_currency_type = 31 [json_name = "changeCurrencyType"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.ChangeCurrencyTypeOrBuilder getChangeCurrencyTypeOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Divide divide = 32 [json_name = "divide"];</code>
   * @return Whether the divide field is set.
   */
  boolean hasDivide();
  /**
   * <code>.api.v0alpha.ReshapeAction.Divide divide = 32 [json_name = "divide"];</code>
   * @return The divide.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Divide getDivide();
  /**
   * <code>.api.v0alpha.ReshapeAction.Divide divide = 32 [json_name = "divide"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.DivideOrBuilder getDivideOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Multiply multiply = 33 [json_name = "multiply"];</code>
   * @return Whether the multiply field is set.
   */
  boolean hasMultiply();
  /**
   * <code>.api.v0alpha.ReshapeAction.Multiply multiply = 33 [json_name = "multiply"];</code>
   * @return The multiply.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Multiply getMultiply();
  /**
   * <code>.api.v0alpha.ReshapeAction.Multiply multiply = 33 [json_name = "multiply"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.MultiplyOrBuilder getMultiplyOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Modulo modulo = 34 [json_name = "modulo"];</code>
   * @return Whether the modulo field is set.
   */
  boolean hasModulo();
  /**
   * <code>.api.v0alpha.ReshapeAction.Modulo modulo = 34 [json_name = "modulo"];</code>
   * @return The modulo.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Modulo getModulo();
  /**
   * <code>.api.v0alpha.ReshapeAction.Modulo modulo = 34 [json_name = "modulo"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.ModuloOrBuilder getModuloOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Merge merge = 40 [json_name = "merge"];</code>
   * @return Whether the merge field is set.
   */
  boolean hasMerge();
  /**
   * <code>.api.v0alpha.ReshapeAction.Merge merge = 40 [json_name = "merge"];</code>
   * @return The merge.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Merge getMerge();
  /**
   * <code>.api.v0alpha.ReshapeAction.Merge merge = 40 [json_name = "merge"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.MergeOrBuilder getMergeOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.SetFieldValue set_field_value = 41 [json_name = "setFieldValue"];</code>
   * @return Whether the setFieldValue field is set.
   */
  boolean hasSetFieldValue();
  /**
   * <code>.api.v0alpha.ReshapeAction.SetFieldValue set_field_value = 41 [json_name = "setFieldValue"];</code>
   * @return The setFieldValue.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SetFieldValue getSetFieldValue();
  /**
   * <code>.api.v0alpha.ReshapeAction.SetFieldValue set_field_value = 41 [json_name = "setFieldValue"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SetFieldValueOrBuilder getSetFieldValueOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.AddNewFieldFromField add_new_field_from_field = 45 [json_name = "addNewFieldFromField"];</code>
   * @return Whether the addNewFieldFromField field is set.
   */
  boolean hasAddNewFieldFromField();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddNewFieldFromField add_new_field_from_field = 45 [json_name = "addNewFieldFromField"];</code>
   * @return The addNewFieldFromField.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddNewFieldFromField getAddNewFieldFromField();
  /**
   * <code>.api.v0alpha.ReshapeAction.AddNewFieldFromField add_new_field_from_field = 45 [json_name = "addNewFieldFromField"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.AddNewFieldFromFieldOrBuilder getAddNewFieldFromFieldOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.SetFieldFromField set_field_from_field = 46 [json_name = "setFieldFromField"];</code>
   * @return Whether the setFieldFromField field is set.
   */
  boolean hasSetFieldFromField();
  /**
   * <code>.api.v0alpha.ReshapeAction.SetFieldFromField set_field_from_field = 46 [json_name = "setFieldFromField"];</code>
   * @return The setFieldFromField.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SetFieldFromField getSetFieldFromField();
  /**
   * <code>.api.v0alpha.ReshapeAction.SetFieldFromField set_field_from_field = 46 [json_name = "setFieldFromField"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.SetFieldFromFieldOrBuilder getSetFieldFromFieldOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Pad pad = 52 [json_name = "pad"];</code>
   * @return Whether the pad field is set.
   */
  boolean hasPad();
  /**
   * <code>.api.v0alpha.ReshapeAction.Pad pad = 52 [json_name = "pad"];</code>
   * @return The pad.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Pad getPad();
  /**
   * <code>.api.v0alpha.ReshapeAction.Pad pad = 52 [json_name = "pad"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.PadOrBuilder getPadOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Trim trim = 53 [json_name = "trim"];</code>
   * @return Whether the trim field is set.
   */
  boolean hasTrim();
  /**
   * <code>.api.v0alpha.ReshapeAction.Trim trim = 53 [json_name = "trim"];</code>
   * @return The trim.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Trim getTrim();
  /**
   * <code>.api.v0alpha.ReshapeAction.Trim trim = 53 [json_name = "trim"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.TrimOrBuilder getTrimOrBuilder();

  /**
   * <code>.api.v0alpha.ReshapeAction.Extract extract = 54 [json_name = "extract"];</code>
   * @return Whether the extract field is set.
   */
  boolean hasExtract();
  /**
   * <code>.api.v0alpha.ReshapeAction.Extract extract = 54 [json_name = "extract"];</code>
   * @return The extract.
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.Extract getExtract();
  /**
   * <code>.api.v0alpha.ReshapeAction.Extract extract = 54 [json_name = "extract"];</code>
   */
  com.tcn.cloud.api.api.v0alpha.ReshapeAction.ExtractOrBuilder getExtractOrBuilder();

  com.tcn.cloud.api.api.v0alpha.ReshapeAction.ActionCase getActionCase();
}
