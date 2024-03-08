// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: api/commons/org/huntgroup.proto

package com.tcn.cloud.api.api.commons.org;

public interface ClientInfoDisplayTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:api.commons.org.ClientInfoDisplayTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The template sid of the client info display template
   * </pre>
   *
   * <code>string template_sid = 1 [json_name = "templateSid", deprecated = true];</code>
   * @deprecated api.commons.org.ClientInfoDisplayTemplate.template_sid is deprecated.
   *     See api/commons/org/huntgroup.proto;l=770
   * @return The templateSid.
   */
  @java.lang.Deprecated java.lang.String getTemplateSid();
  /**
   * <pre>
   * The template sid of the client info display template
   * </pre>
   *
   * <code>string template_sid = 1 [json_name = "templateSid", deprecated = true];</code>
   * @deprecated api.commons.org.ClientInfoDisplayTemplate.template_sid is deprecated.
   *     See api/commons/org/huntgroup.proto;l=770
   * @return The bytes for templateSid.
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getTemplateSidBytes();

  /**
   * <pre>
   * The name of the client info display template
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the client info display template
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The description of the client info display template
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the client info display template
   * </pre>
   *
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Bool used to determine whether to show all fields in a client info display template
   * </pre>
   *
   * <code>bool display_all_fields = 4 [json_name = "displayAllFields"];</code>
   * @return The displayAllFields.
   */
  boolean getDisplayAllFields();

  /**
   * <pre>
   * The dialed number field style of a client info display template
   * </pre>
   *
   * <code>.api.commons.org.DialedNumberFieldStyle dialed_number_field_style = 5 [json_name = "dialedNumberFieldStyle"];</code>
   * @return Whether the dialedNumberFieldStyle field is set.
   */
  boolean hasDialedNumberFieldStyle();
  /**
   * <pre>
   * The dialed number field style of a client info display template
   * </pre>
   *
   * <code>.api.commons.org.DialedNumberFieldStyle dialed_number_field_style = 5 [json_name = "dialedNumberFieldStyle"];</code>
   * @return The dialedNumberFieldStyle.
   */
  com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyle getDialedNumberFieldStyle();
  /**
   * <pre>
   * The dialed number field style of a client info display template
   * </pre>
   *
   * <code>.api.commons.org.DialedNumberFieldStyle dialed_number_field_style = 5 [json_name = "dialedNumberFieldStyle"];</code>
   */
  com.tcn.cloud.api.api.commons.org.DialedNumberFieldStyleOrBuilder getDialedNumberFieldStyleOrBuilder();

  /**
   * <pre>
   * A list of Contact Field Styles for a client info display template
   * </pre>
   *
   * <code>repeated .api.commons.org.ContactFieldStyle contact_field_styles = 6 [json_name = "contactFieldStyles"];</code>
   */
  java.util.List<com.tcn.cloud.api.api.commons.org.ContactFieldStyle> 
      getContactFieldStylesList();
  /**
   * <pre>
   * A list of Contact Field Styles for a client info display template
   * </pre>
   *
   * <code>repeated .api.commons.org.ContactFieldStyle contact_field_styles = 6 [json_name = "contactFieldStyles"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ContactFieldStyle getContactFieldStyles(int index);
  /**
   * <pre>
   * A list of Contact Field Styles for a client info display template
   * </pre>
   *
   * <code>repeated .api.commons.org.ContactFieldStyle contact_field_styles = 6 [json_name = "contactFieldStyles"];</code>
   */
  int getContactFieldStylesCount();
  /**
   * <pre>
   * A list of Contact Field Styles for a client info display template
   * </pre>
   *
   * <code>repeated .api.commons.org.ContactFieldStyle contact_field_styles = 6 [json_name = "contactFieldStyles"];</code>
   */
  java.util.List<? extends com.tcn.cloud.api.api.commons.org.ContactFieldStyleOrBuilder> 
      getContactFieldStylesOrBuilderList();
  /**
   * <pre>
   * A list of Contact Field Styles for a client info display template
   * </pre>
   *
   * <code>repeated .api.commons.org.ContactFieldStyle contact_field_styles = 6 [json_name = "contactFieldStyles"];</code>
   */
  com.tcn.cloud.api.api.commons.org.ContactFieldStyleOrBuilder getContactFieldStylesOrBuilder(
      int index);

  /**
   * <pre>
   * The template type
   * </pre>
   *
   * <code>.api.commons.org.TemplateCategory template_category = 7 [json_name = "templateCategory"];</code>
   * @return The enum numeric value on the wire for templateCategory.
   */
  int getTemplateCategoryValue();
  /**
   * <pre>
   * The template type
   * </pre>
   *
   * <code>.api.commons.org.TemplateCategory template_category = 7 [json_name = "templateCategory"];</code>
   * @return The templateCategory.
   */
  com.tcn.cloud.api.api.commons.org.TemplateCategory getTemplateCategory();

  /**
   * <pre>
   * The sid of the client info display template
   * </pre>
   *
   * <code>int64 client_info_display_template_sid = 8 [json_name = "clientInfoDisplayTemplateSid"];</code>
   * @return The clientInfoDisplayTemplateSid.
   */
  long getClientInfoDisplayTemplateSid();

  /**
   * <pre>
   * The sid of the hunt group which the client info display template is associated with
   * </pre>
   *
   * <code>int64 hunt_group_sid = 9 [json_name = "huntGroupSid"];</code>
   * @return The huntGroupSid.
   */
  long getHuntGroupSid();
}
