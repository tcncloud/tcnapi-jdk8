// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/scorecards.proto

package com.tcn.cloud.api.api.commons;

public interface CategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.Category)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * unique id of the category
   * </pre>
   *
   * <code>int64 category_id = 1 [json_name = "categoryId"];</code>
   * @return The categoryId.
   */
  long getCategoryId();

  /**
   * <pre>
   * user who created the category
   * </pre>
   *
   * <code>string author_id = 3 [json_name = "authorId"];</code>
   * @return The authorId.
   */
  java.lang.String getAuthorId();
  /**
   * <pre>
   * user who created the category
   * </pre>
   *
   * <code>string author_id = 3 [json_name = "authorId"];</code>
   * @return The bytes for authorId.
   */
  com.google.protobuf.ByteString
      getAuthorIdBytes();

  /**
   * <pre>
   * title, or name, of the category
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title, or name, of the category
   * </pre>
   *
   * <code>string title = 4 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * description of category (i.e. purpose and use)
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description of category (i.e. purpose and use)
   * </pre>
   *
   * <code>string description = 5 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * skill_profiles ids related to category
   * </pre>
   *
   * <code>repeated int64 skill_profiles = 6 [json_name = "skillProfiles"];</code>
   * @return A list containing the skillProfiles.
   */
  java.util.List<java.lang.Long> getSkillProfilesList();
  /**
   * <pre>
   * skill_profiles ids related to category
   * </pre>
   *
   * <code>repeated int64 skill_profiles = 6 [json_name = "skillProfiles"];</code>
   * @return The count of skillProfiles.
   */
  int getSkillProfilesCount();
  /**
   * <pre>
   * skill_profiles ids related to category
   * </pre>
   *
   * <code>repeated int64 skill_profiles = 6 [json_name = "skillProfiles"];</code>
   * @param index The index of the element to return.
   * @return The skillProfiles at the given index.
   */
  long getSkillProfiles(int index);

  /**
   * <pre>
   * current version of the category
   * </pre>
   *
   * <code>int32 version = 7 [json_name = "version"];</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * call types supported by the category
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 10 [json_name = "callTypes"];</code>
   * @return A list containing the callTypes.
   */
  java.util.List<com.tcn.cloud.api.api.commons.CallType.Enum> getCallTypesList();
  /**
   * <pre>
   * call types supported by the category
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 10 [json_name = "callTypes"];</code>
   * @return The count of callTypes.
   */
  int getCallTypesCount();
  /**
   * <pre>
   * call types supported by the category
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 10 [json_name = "callTypes"];</code>
   * @param index The index of the element to return.
   * @return The callTypes at the given index.
   */
  com.tcn.cloud.api.api.commons.CallType.Enum getCallTypes(int index);
  /**
   * <pre>
   * call types supported by the category
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 10 [json_name = "callTypes"];</code>
   * @return A list containing the enum numeric values on the wire for callTypes.
   */
  java.util.List<java.lang.Integer>
  getCallTypesValueList();
  /**
   * <pre>
   * call types supported by the category
   * </pre>
   *
   * <code>repeated .api.commons.CallType.Enum call_types = 10 [json_name = "callTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of callTypes at the given index.
   */
  int getCallTypesValue(int index);

  /**
   * <pre>
   * whether a category is a system category (read only)
   * </pre>
   *
   * <code>bool is_system = 11 [json_name = "isSystem"];</code>
   * @return The isSystem.
   */
  boolean getIsSystem();

  /**
   * <pre>
   * Type of category, (skill calls or manual calls)
   * </pre>
   *
   * <code>.api.commons.CategoryType category_type = 12 [json_name = "categoryType"];</code>
   * @return The enum numeric value on the wire for categoryType.
   */
  int getCategoryTypeValue();
  /**
   * <pre>
   * Type of category, (skill calls or manual calls)
   * </pre>
   *
   * <code>.api.commons.CategoryType category_type = 12 [json_name = "categoryType"];</code>
   * @return The categoryType.
   */
  com.tcn.cloud.api.api.commons.CategoryType getCategoryType();
}
